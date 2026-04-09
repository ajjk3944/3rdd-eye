.class final synthetic Lxb/e$b;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxb/e;->b(Lgg/b;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final a:Lxb/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxb/e$b;

    invoke-direct {v0}, Lxb/e$b;-><init>()V

    sput-object v0, Lxb/e$b;->a:Lxb/e$b;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string/jumbo v4, "mapUnauthorisedException(Lretrofit2/HttpException;)Ljava/lang/Throwable;"

    const/4 v5, 0x1

    const/4 v1, 0x1

    const-class v2, Lxb/e;

    const-string/jumbo v3, "mapUnauthorisedException"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lretrofit2/HttpException;)Ljava/lang/Throwable;
    .locals 1

    const-string/jumbo v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lxb/e;->a(Lretrofit2/HttpException;)Ljava/lang/Throwable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lretrofit2/HttpException;

    invoke-virtual {p0, p1}, Lxb/e$b;->a(Lretrofit2/HttpException;)Ljava/lang/Throwable;

    move-result-object p1

    return-object p1
.end method
