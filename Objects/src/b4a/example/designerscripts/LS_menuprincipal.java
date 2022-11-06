package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_menuprincipal{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("boton_1").vw.setLeft((int)((60d / 100 * width) - (views.get("boton_1").vw.getWidth() / 2)));
//BA.debugLineNum = 4;BA.debugLine="boton_1.VerticalCenter = 32%y"[menuprincipal/General script]
views.get("boton_1").vw.setTop((int)((32d / 100 * height) - (views.get("boton_1").vw.getHeight() / 2)));
//BA.debugLineNum = 5;BA.debugLine="boton_2.HorizontalCenter = 60%x"[menuprincipal/General script]
views.get("boton_2").vw.setLeft((int)((60d / 100 * width) - (views.get("boton_2").vw.getWidth() / 2)));
//BA.debugLineNum = 6;BA.debugLine="boton_2.VerticalCenter = 47%y"[menuprincipal/General script]
views.get("boton_2").vw.setTop((int)((47d / 100 * height) - (views.get("boton_2").vw.getHeight() / 2)));
//BA.debugLineNum = 7;BA.debugLine="boton_3.HorizontalCenter = 60%x"[menuprincipal/General script]
views.get("boton_3").vw.setLeft((int)((60d / 100 * width) - (views.get("boton_3").vw.getWidth() / 2)));
//BA.debugLineNum = 8;BA.debugLine="boton_3.VerticalCenter = 62%y"[menuprincipal/General script]
views.get("boton_3").vw.setTop((int)((62d / 100 * height) - (views.get("boton_3").vw.getHeight() / 2)));
//BA.debugLineNum = 9;BA.debugLine="boton_salir.HorizontalCenter = 20%x"[menuprincipal/General script]
views.get("boton_salir").vw.setLeft((int)((20d / 100 * width) - (views.get("boton_salir").vw.getWidth() / 2)));
//BA.debugLineNum = 10;BA.debugLine="boton_salir.VerticalCenter = 87%y"[menuprincipal/General script]
views.get("boton_salir").vw.setTop((int)((87d / 100 * height) - (views.get("boton_salir").vw.getHeight() / 2)));

}
}