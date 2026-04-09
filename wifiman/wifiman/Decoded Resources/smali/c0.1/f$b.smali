.class final Lc0/f$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lc0/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc0/f$b;

    invoke-direct {v0}, Lc0/f$b;-><init>()V

    sput-object v0, Lc0/f$b;->a:Lc0/f$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Lc0/f;
    .locals 1

    new-instance v0, Lc0/f;

    invoke-direct {v0, p1}, Lc0/f;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Lc0/f$b;->a(Ljava/util/Map;)Lc0/f;

    move-result-object p1

    return-object p1
.end method
