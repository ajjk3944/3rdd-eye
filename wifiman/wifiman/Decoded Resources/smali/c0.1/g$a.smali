.class final Lc0/g$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc0/g;->a(LT/l;I)Lc0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lc0/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc0/g$a;

    invoke-direct {v0}, Lc0/g$a;-><init>()V

    sput-object v0, Lc0/g$a;->a:Lc0/g$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lc0/f;
    .locals 3

    new-instance v0, Lc0/f;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lc0/f;-><init>(Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lc0/g$a;->a()Lc0/f;

    move-result-object v0

    return-object v0
.end method
