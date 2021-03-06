
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SolarSystem {
	ArrayList<CelestialBody> bodies = new ArrayList<CelestialBody>();
	Image sun = new ImageIcon("solarimages/sun.png").getImage();
	Image earth = new ImageIcon("solarimages/earth.png").getImage();
	Image jupiter = new ImageIcon("solarimages/jupiter.png").getImage();
	Image mars = new ImageIcon("solarimages/mars.png").getImage();
	Image mercury = new ImageIcon("solarimages/mercury.png").getImage();
	Image moon = new ImageIcon("solarimages/moon.png").getImage();
	Image neptune = new ImageIcon("solarimages/neptune.png").getImage();
	Image saturn = new ImageIcon("solarimages/saturn.png").getImage();
	Image titan = new ImageIcon("solarimages/titan.png").getImage();
	Image uranus = new ImageIcon("solarimages/uranus.png").getImage();
	Image venus = new ImageIcon("solarimages/venus.png").getImage();

	public SolarSystem() {

		// creating the solar system by filling the ArrayList with CelestialBodies.
		// name, picture, mass, x, y, z, vX, vY, vZ
		bodies.add(new CelestialBody("Sun", sun, 1.988500e30, -6.806783239281648e+08, 1.080005533878725e+09,
				6.564012751690170e+06, -1.420511669610689e+01, -4.954714716629277e+00, 3.994237625449041e-01));
		bodies.add(new CelestialBody("Earth", earth, 5.9719E24, -1.471922101663588e+11, -2.860995816266412e+10,
				8.278183193596080e+06, 5.427193405797901e+03, -2.931056622265021e+04, 6.575428158157592e-01));
		bodies.add(new CelestialBody("Venus", venus, 4.8685e24, -9.435345478592035e+10, 5.350359551033670e+10,
				6.131453014410347e+09, -1.726404287724406e+04, -3.073432518238123e+04, 5.741783385280979e-04));
		bodies.add(new CelestialBody("Mars", mars, 6.4171e23, -3.615638921529161e+10, -2.167633037046744e+11,
				-3.687670305939779e+09, 2.481551975121696e+04, -1.816368005464070e+03, -6.467321619018108e+02));
		bodies.add(new CelestialBody("Jupiter", jupiter, 1.89813e27, 1.781303138592153e+11, -7.551118436250277e+11,
				-8.532838524802327e+08, 1.255852555185220e+04, 3.622680192790968e+03, -2.958620380112444e+02));
		bodies.add(new CelestialBody("Saturn", saturn, 5.6834e26, 6.328646641500651e+11, -1.358172804527507e+12,
				-1.578520137930810e+09, 8.220842186554890e+03, 4.052137378979608e+03, -3.976224719266916e+02));
		bodies.add(new CelestialBody("Titan", titan, 1.34553e23, 6.332873118527889e+11, -1.357175556995868e+12,
				-2.134637041453660e+09, 3.056877965721629e+03, 6.125612956428791e+03, -9.523587380845593e+02));
		bodies.add(new CelestialBody("Neptune ", neptune, 1.02413e26, 4.382692942729203e+12, -9.093501655486243e+11,
				8.227728929479486e+10, 1.068410720964204e+03, 5.354959501569486e+03, -1.343918199987533e+02));
		bodies.add(new CelestialBody("Moon ", moon, 7.349e22, -1.472343904597218e+11, -2.822578361503422e+10,
				1.052790970065631e+07, 4.433121605215677e+03, -2.948453614110320e+04, 8.896598225322805e+01));
		bodies.add(new CelestialBody("Uranus", uranus, 8.6813e25, 2.395195786685187e+12, 1.744450959214586e+12,
				-2.455116324031639e+10, -4.059468635313243e+03, 5.187467354884825e+03, 7.182516236837899e+01));
		bodies.add(new CelestialBody("Mercury", mercury, 3.302e23, 6.047855986424127e+06, -6.801800047868888e+10,
				-5.702742359714534e+09, 3.892585189044652e+04, 2.978342247012996e+03, -3.327964151414740e+03));
		bodies.get(1).setRadius(6371e3); // EARTH
		bodies.get(6).setRadius(2575.5e3); // TITAN

	}

	public void add(CelestialBody newBody) {
		bodies.add(newBody);
	}

}