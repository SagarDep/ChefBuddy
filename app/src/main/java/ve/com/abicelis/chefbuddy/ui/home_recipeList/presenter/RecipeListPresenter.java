package ve.com.abicelis.chefbuddy.ui.home_recipeList.presenter;

import android.support.annotation.NonNull;

import ve.com.abicelis.chefbuddy.ui.home_recipeList.view.RecipeListView;

/**
 * Created by abicelis on 8/7/2017.
 */

public interface RecipeListPresenter {
    void attachView(RecipeListView view);
    void detachView();

    void getRecipes();
    void getFilteredRecipes(@NonNull String query);
    void cancelFilteredRecipes();
}
