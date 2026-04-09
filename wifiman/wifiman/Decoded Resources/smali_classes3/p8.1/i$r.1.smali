.class final Lp8/i$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/i;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lp8/i$r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp8/i$r;

    invoke-direct {v0}, Lp8/i$r;-><init>()V

    sput-object v0, Lp8/i$r;->a:Lp8/i$r;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;LLe/b;)LYg/s;
    .locals 1

    const-string/jumbo v0, "prev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->j()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    check-cast p2, LLe/b;

    invoke-virtual {p0, p1, p2}, Lp8/i$r;->a(LYg/s;LLe/b;)LYg/s;

    move-result-object p1

    return-object p1
.end method
