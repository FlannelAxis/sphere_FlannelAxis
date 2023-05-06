//create a sphere
def mov=0
CSG sphere = new Sphere(30)// Spheres radius
				.toCSG()// convert to CSG to display
				
CSG sphereHighRes = new Sphere(30,// Spheres radius
						4,//elevation Divisions
						2)// vertical divisions
						.toCSG()// convert to CSG to display
//println sphere.getTotalX()
//println sphereHighRes.getTotalX()
def offset1=sphere.getTotalX()/2
def offset2=sphereHighRes.getTotalX()/2

mov=offset1+offset2
sphere=sphere.movex(mov)
return [sphere,sphereHighRes]