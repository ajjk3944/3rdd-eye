.class final LA8/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/f;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LA8/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LA8/f$a;

    invoke-direct {v0}, LA8/f$a;-><init>()V

    sput-object v0, LA8/f$a;->a:LA8/f$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lod/a;LUe/g;)LWe/b;
    .locals 3

    const-string/jumbo v0, "record"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "controller"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lod/a;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ls9/d$c;

    invoke-direct {v1, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ls9/d$b;

    const v0, 0x7f1103ca

    invoke-direct {v1, v0}, Ls9/d$b;-><init>(I)V

    :goto_0
    sget-object v0, LUe/r;->a:LUe/r;

    invoke-virtual {v0}, LUe/r;->c()LTe/W;

    move-result-object v0

    new-instance v2, Ls9/d$c;

    invoke-virtual {p1}, Lod/a;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    invoke-direct {v2, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance p1, LWe/b;

    invoke-direct {p1, p2, v0, v2, v1}, LWe/b;-><init>(LUe/g;LTe/W;Ls9/d;Ls9/d;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lod/a;

    check-cast p2, LUe/g;

    invoke-virtual {p0, p1, p2}, LA8/f$a;->a(Lod/a;LUe/g;)LWe/b;

    move-result-object p1

    return-object p1
.end method
