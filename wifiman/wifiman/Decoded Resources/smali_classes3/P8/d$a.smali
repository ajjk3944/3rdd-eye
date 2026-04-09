.class final LP8/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/d;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LP8/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/d$a;

    invoke-direct {v0}, LP8/d$a;-><init>()V

    sput-object v0, LP8/d$a;->a:LP8/d$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LPf/a;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LPf/a;->a()LPf/a$a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LPf/a$a;->a()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    new-instance v1, LIf/n;

    invoke-virtual {p1}, LPf/a;->a()LPf/a$a;

    move-result-object p1

    invoke-virtual {p1}, LPf/a$a;->b()Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v1, v0, p1}, LIf/n;-><init>(FZ)V

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LP8/d$a;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
