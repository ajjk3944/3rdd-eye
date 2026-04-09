.class public Landroidx/compose/ui/platform/coreshims/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Landroid/view/autofill/AutofillId;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/coreshims/a;->a:Ljava/lang/Object;

    return-void
.end method

.method public static b(Landroid/view/autofill/AutofillId;)Landroidx/compose/ui/platform/coreshims/a;
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/coreshims/a;

    invoke-direct {v0, p0}, Landroidx/compose/ui/platform/coreshims/a;-><init>(Landroid/view/autofill/AutofillId;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/view/autofill/AutofillId;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/coreshims/a;->a:Ljava/lang/Object;

    check-cast v0, Landroid/view/autofill/AutofillId;

    return-object v0
.end method
