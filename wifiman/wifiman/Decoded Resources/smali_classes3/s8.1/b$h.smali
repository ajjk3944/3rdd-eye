.class final Ls8/b$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ls8/b$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls8/b$h;

    invoke-direct {v0}, Ls8/b$h;-><init>()V

    sput-object v0, Ls8/b$h;->a:Ls8/b$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)LCi/c;
    .locals 1

    const-string/jumbo v0, "notifications"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Ls8/b$h;->a(Ljava/util/List;)LCi/c;

    move-result-object p1

    return-object p1
.end method
