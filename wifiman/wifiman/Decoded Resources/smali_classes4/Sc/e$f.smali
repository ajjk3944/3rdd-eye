.class final LSc/e$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSc/e;->r()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LSc/e$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSc/e$f;

    invoke-direct {v0}, LSc/e$f;-><init>()V

    sput-object v0, LSc/e$f;->a:LSc/e$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LSc/e$b;)Ljava/util/List;
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p1}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LSc/e$b;

    invoke-virtual {p0, p1}, LSc/e$f;->a(LSc/e$b;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
