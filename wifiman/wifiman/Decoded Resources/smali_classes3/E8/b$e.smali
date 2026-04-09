.class final LE8/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/b;-><init>(Lrd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/b$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/b$e;

    invoke-direct {v0}, LE8/b$e;-><init>()V

    sput-object v0, LE8/b$e;->a:LE8/b$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)LE8/a$a;
    .locals 3

    const-string/jumbo v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LE8/a$a$a;

    invoke-virtual {v2}, LE8/a$a$a;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    new-instance v0, LE8/a$a$c;

    invoke-direct {v0, p1}, LE8/a$a$c;-><init>(Ljava/util/List;)V

    goto :goto_1

    :cond_2
    sget-object v0, LE8/a$a$b;->a:LE8/a$a$b;

    :goto_1
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LE8/b$e;->a(Ljava/util/List;)LE8/a$a;

    move-result-object p1

    return-object p1
.end method
