.class final LT0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LT/z1;

.field private final b:LT0/s;

.field private final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LT/z1;LT0/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT0/s;->a:LT/z1;

    iput-object p2, p0, LT0/s;->b:LT0/s;

    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LT0/s;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Typeface;
    .locals 2

    iget-object v0, p0, LT0/s;->c:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type android.graphics.Typeface"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/Typeface;

    return-object v0
.end method

.method public final b()Z
    .locals 2

    iget-object v0, p0, LT0/s;->a:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LT0/s;->c:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LT0/s;->b:LT0/s;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LT0/s;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
