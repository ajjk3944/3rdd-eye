.class final Lfe/h$d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfe/h$d;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lfe/h$d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfe/h$d$b;

    invoke-direct {v0}, Lfe/h$d$b;-><init>()V

    sput-object v0, Lfe/h$d$b;->a:Lfe/h$d$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/D;
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lretrofit2/HttpException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lretrofit2/HttpException;

    invoke-virtual {v0}, Lretrofit2/HttpException;->a()I

    move-result v0

    const/16 v1, 0x190

    if-gt v1, v0, :cond_0

    const/16 v1, 0x1f4

    if-ge v0, v1, :cond_0

    new-instance p1, LWc/b$c;

    invoke-direct {p1}, LWc/b$c;-><init>()V

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/google/gson/JsonParseException;

    if-eqz v0, :cond_1

    new-instance p1, LWc/b$c;

    invoke-direct {p1}, LWc/b$c;-><init>()V

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance v0, LWc/b$a$a;

    invoke-direct {v0, p1}, LWc/b$a$a;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lfe/h$d$b;->a(Ljava/lang/Throwable;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
