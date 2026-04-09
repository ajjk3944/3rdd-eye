.class final LMj/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# static fields
.field static final a:LMj/b$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LMj/b$e;

    invoke-direct {v0}, LMj/b$e;-><init>()V

    sput-object v0, LMj/b$e;->a:LMj/b$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lokhttp3/ResponseBody;

    invoke-virtual {p0, p1}, LMj/b$e;->b(Lokhttp3/ResponseBody;)LYg/J;

    move-result-object p1

    return-object p1
.end method

.method public b(Lokhttp3/ResponseBody;)LYg/J;
    .locals 0

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
