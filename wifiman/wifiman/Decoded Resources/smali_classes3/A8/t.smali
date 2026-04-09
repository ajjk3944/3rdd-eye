.class public final LA8/t;
.super Ll7/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA8/t$a;
    }
.end annotation


# static fields
.field public static final b:LA8/t$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LA8/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LA8/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LA8/t;->b:LA8/t$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll7/g;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(LW7/d;)Ll7/i;
    .locals 0

    invoke-virtual {p0, p1}, LA8/t;->e(LW7/d;)Lod/f;

    move-result-object p1

    return-object p1
.end method

.method protected e(LW7/d;)Lod/f;
    .locals 3

    const-string/jumbo v0, "coordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lod/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lod/f$a;-><init>(II)V

    new-instance v1, Lod/f;

    const-string v2, ""

    invoke-direct {v1, p1, v2, v0}, Lod/f;-><init>(LW7/d;Ljava/lang/String;Lod/f$a;)V

    return-object v1
.end method
