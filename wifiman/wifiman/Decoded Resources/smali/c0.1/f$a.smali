.class final Lc0/f$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lc0/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc0/f$a;

    invoke-direct {v0}, Lc0/f$a;-><init>()V

    sput-object v0, Lc0/f$a;->a:Lc0/f$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc0/m;Lc0/f;)Ljava/util/Map;
    .locals 0

    invoke-static {p2}, Lc0/f;->e(Lc0/f;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/m;

    check-cast p2, Lc0/f;

    invoke-virtual {p0, p1, p2}, Lc0/f$a;->a(Lc0/m;Lc0/f;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
