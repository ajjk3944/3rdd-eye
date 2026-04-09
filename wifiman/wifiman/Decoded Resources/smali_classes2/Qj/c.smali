.class final LQj/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj/h;


# static fields
.field static final a:LQj/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQj/c;

    invoke-direct {v0}, LQj/c;-><init>()V

    sput-object v0, LQj/c;->a:LQj/c;

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

    invoke-virtual {p0, p1}, LQj/c;->b(Lokhttp3/ResponseBody;)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public b(Lokhttp3/ResponseBody;)Ljava/lang/Byte;
    .locals 0

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->C()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(Ljava/lang/String;)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
