.class final LMj/b$f;
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
    name = "f"
.end annotation


# static fields
.field static final a:LMj/b$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LMj/b$f;

    invoke-direct {v0}, LMj/b$f;-><init>()V

    sput-object v0, LMj/b$f;->a:LMj/b$f;

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

    invoke-virtual {p0, p1}, LMj/b$f;->b(Lokhttp3/ResponseBody;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public b(Lokhttp3/ResponseBody;)Ljava/lang/Void;
    .locals 0

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    const/4 p1, 0x0

    return-object p1
.end method
