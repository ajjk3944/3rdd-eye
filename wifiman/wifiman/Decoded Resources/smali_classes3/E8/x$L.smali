.class final LE8/x$L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/x;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/x$L;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/x$L;

    invoke-direct {v0}, LE8/x$L;-><init>()V

    sput-object v0, LE8/x$L;->a:LE8/x$L;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LE8/k;)Ll9/a;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    instance-of v1, p1, LE8/l;

    if-nez v1, :cond_3

    instance-of v1, p1, LE8/h;

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v1, p1, LE8/m;

    if-nez v1, :cond_2

    instance-of p1, p1, LE8/g;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    :goto_0
    new-instance p1, Ls9/d$b;

    const v1, 0x7f1102ae

    invoke-direct {p1, v1}, Ls9/d$b;-><init>(I)V

    goto :goto_2

    :cond_3
    :goto_1
    new-instance p1, Ls9/d$b;

    const v1, 0x7f1102ad

    invoke-direct {p1, v1}, Ls9/d$b;-><init>(I)V

    :goto_2
    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE8/k;

    invoke-virtual {p0, p1}, LE8/x$L;->a(LE8/k;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
