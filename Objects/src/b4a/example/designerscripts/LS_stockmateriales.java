package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_stockmateriales{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("boton_volver").vw.setLeft((int)((80d / 100 * width) - (views.get("boton_volver").vw.getWidth() / 2)));
views.get("boton_volver").vw.setTop((int)((87d / 100 * height) - (views.get("boton_volver").vw.getHeight() / 2)));

}
}