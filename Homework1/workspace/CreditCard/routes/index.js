/*
 * GET home page.
 */

function index(req, res)
{
	res.render('index', 
	{
		title : 'Express',
		cardNumber : '' ,
		cvvNumber : '',
		validTillMonth : '',
		validTillYear : '',
		validationResult:''
	});
}

exports.index = index;