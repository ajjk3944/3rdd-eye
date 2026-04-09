.class final LQ1/a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ1/a;->b(Ljava/lang/String;LP1/b;Lmh/l;LIi/N;ILjava/lang/Object;)Lph/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LQ1/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ1/a$a;

    invoke-direct {v0}, LQ1/a$a;-><init>()V

    sput-object v0, LQ1/a$a;->a:LQ1/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ljava/util/List;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, LQ1/a$a;->a(Landroid/content/Context;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
