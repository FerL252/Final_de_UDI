package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_facturacion{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[facturacion/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="boton_volver.HorizontalCenter = 80%x"[facturacion/General script]
views.get("boton_volver").vw.setLeft((int)((80d / 100 * width) - (views.get("boton_volver").vw.getWidth() / 2)));
//BA.debugLineNum = 4;BA.debugLine="boton_volver.VerticalCenter = 87%y"[facturacion/General script]
views.get("boton_volver").vw.setTop((int)((87d / 100 * height) - (views.get("boton_volver").vw.getHeight() / 2)));

}
}