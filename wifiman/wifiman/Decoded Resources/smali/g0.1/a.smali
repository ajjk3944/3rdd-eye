.class public final Lg0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/d;


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Lg0/i;

.field private final c:Landroid/view/autofill/AutofillManager;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lg0/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/a;->a:Landroid/view/View;

    iput-object p2, p0, Lg0/a;->b:Lg0/i;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-class v0, Landroid/view/autofill/AutofillManager;

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/autofill/AutofillManager;

    if-eqz p2, :cond_0

    iput-object p2, p0, Lg0/a;->c:Landroid/view/autofill/AutofillManager;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setImportantForAutofill(I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Autofill service could not be located."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(Lg0/h;)V
    .locals 7

    invoke-virtual {p1}, Lg0/h;->d()Ll0/i;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lg0/a;->c:Landroid/view/autofill/AutofillManager;

    iget-object v2, p0, Lg0/a;->a:Landroid/view/View;

    invoke-virtual {p1}, Lg0/h;->e()I

    move-result p1

    new-instance v3, Landroid/graphics/Rect;

    invoke-virtual {v0}, Ll0/i;->k()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {v0}, Ll0/i;->n()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    invoke-virtual {v0}, Ll0/i;->l()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    invoke-virtual {v0}, Ll0/i;->e()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-direct {v3, v4, v5, v6, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/autofill/AutofillManager;->notifyViewEntered(Landroid/view/View;ILandroid/graphics/Rect;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "requestAutofill called before onChildPositioned()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Lg0/h;)V
    .locals 2

    iget-object v0, p0, Lg0/a;->c:Landroid/view/autofill/AutofillManager;

    iget-object v1, p0, Lg0/a;->a:Landroid/view/View;

    invoke-virtual {p1}, Lg0/h;->e()I

    move-result p1

    invoke-virtual {v0, v1, p1}, Landroid/view/autofill/AutofillManager;->notifyViewExited(Landroid/view/View;I)V

    return-void
.end method

.method public final c()Landroid/view/autofill/AutofillManager;
    .locals 1

    iget-object v0, p0, Lg0/a;->c:Landroid/view/autofill/AutofillManager;

    return-object v0
.end method

.method public final d()Lg0/i;
    .locals 1

    iget-object v0, p0, Lg0/a;->b:Lg0/i;

    return-object v0
.end method

.method public final e()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lg0/a;->a:Landroid/view/View;

    return-object v0
.end method
