package ve.com.abicelis.chefbuddy.app;


/**
 * Created by abicelis on 8/7/2017.
 */

public class Constants {
    public static final String CHEFF_BUDDY = " - Chef Buddy";

    public static final String  IMAGE_FILE_EXTENSION = ".jpg";
    public static final String  PDF_FILE_EXTENSION = ".pdf";
    public static final String  IMAGE_FILES_DIR = "recipe/image";
    public static final String  IMAGE_FILENAMES_SEPARATOR = "|";
    public static final int     IMAGE_JPEG_COMPRESSION_PERCENTAGE = 30;
    public static final int     THUMBNAIL_LARGER_DIMENSION = 480;


    public static final String RECIPE_INGREDIENT_STRING_FORMAT = "%1$s%2$s %3$s";

    public static final int MAX_LENGHT_RECIPE_INGREDIENT_AMOUNT = 5;
    public static final int MAX_LENGHT_RECIPE_INGREDIENT_INGREDIENT = 15;


    /* INTENT EXTRAS */
    public static final String RECIPE_DETAIL_ACTIVITY_INTENT_EXTRA_RECIPE_ID = "RECIPE_DETAIL_ACTIVITY_INTENT_EXTRA_RECIPE_ID";
    public static final String ADD_EDIT_RECIPE_ACTIVITY_INTENT_EXTRA_RECIPE_ID = "ADD_EDIT_RECIPE_ACTIVITY_INTENT_EXTRA_RECIPE_ID";
    public static final String IMAGE_GALLERY_ACTIVITY_INTENT_RECIPE_ID = "IMAGE_GALLERY_ACTIVITY_INTENT_RECIPE_ID";
    public static final String IMAGE_GALLERY_ACTIVITY_INTENT_IMAGE_POSITION = "IMAGE_GALLERY_ACTIVITY_INTENT_IMAGE_POSITION";
    public static final String EDIT_IMAGE_ACTIVITY_INTENT_IMAGE_FILENAME = "EDIT_IMAGE_ACTIVITY_INTENT_IMAGE_FILENAME";


    /* PERMISSIONS */
    public static final int RECIPE_DETAIL_ACTIVITY_PERMISSIONS = 200;
    public static final int EDIT_IMAGE_ACTIVITY_PERMISSIONS = 201;


    /* START ACTIVITY REQUEST CODES */
    public static final int REQUEST_ADD_RECIPE_IMAGE = 122;
    public static final int REQUEST_IMAGE_CAPTURE = 123;
    public static final int REQUEST_PICK_IMAGE_GALLERY = 124;


    /* WEB APIS */
    public static final String EDAMAM_BASE_URL = "https://edamam-recipe-search-and-diet-v1.p.mashape.com";
    private static final String EDAMAM_API_KEY_TESTING = "FgW2dpYzYzmshHbrNbwec3dlmvy6p1DHtBLjsn0iVf8VxE8zWS";
    public static final String EDAMAM_API_KEY = EDAMAM_API_KEY_TESTING;


    public static final String FOOD2FORK_BASE_URL = "http://food2fork.com/api";
    public static final String FOOD2FORK_API_KEY = "544dce2bc365fff9a14505aa58c3731b";



}
