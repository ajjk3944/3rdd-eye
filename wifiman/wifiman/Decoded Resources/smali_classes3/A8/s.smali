.class public final LA8/s;
.super Ll7/g;
.source "SourceFile"


# instance fields
.field private b:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ll7/g;-><init>()V

    sget-object v0, LA8/s$a;->a:LA8/s$a;

    iput-object v0, p0, LA8/s;->b:Lmh/l;

    return-void
.end method


# virtual methods
.method public bridge synthetic c(LW7/d;)Ll7/i;
    .locals 0

    invoke-virtual {p0, p1}, LA8/s;->e(LW7/d;)Lod/i;

    move-result-object p1

    return-object p1
.end method

.method protected e(LW7/d;)Lod/i;
    .locals 1

    const-string/jumbo v0, "coordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lod/i;

    invoke-direct {v0, p1}, Lod/i;-><init>(LW7/d;)V

    iget-object p1, p0, LA8/s;->b:Lmh/l;

    invoke-virtual {v0, p1}, Lod/i;->p(Lmh/l;)V

    return-object v0
.end method

.method public final f(Lmh/l;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LA8/s;->b:Lmh/l;

    return-void
.end method
