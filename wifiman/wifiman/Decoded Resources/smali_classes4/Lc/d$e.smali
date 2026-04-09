.class final LLc/d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLc/d;->g()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LLc/d$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LLc/d$e;

    invoke-direct {v0}, LLc/d$e;-><init>()V

    sput-object v0, LLc/d$e;->a:LLc/d$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LLc/d$b;)Ljava/util/List;
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {p1}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLc/d$b;

    invoke-virtual {p0, p1}, LLc/d$e;->a(LLc/d$b;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
