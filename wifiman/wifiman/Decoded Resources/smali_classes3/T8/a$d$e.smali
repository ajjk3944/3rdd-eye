.class public final LT8/a$d$e;
.super LT8/a$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT8/a$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private final a:LT8/c;

.field private final b:LT8/b$a;


# direct methods
.method public constructor <init>(LT8/c;LT8/b$a;)V
    .locals 1

    const-string/jumbo v0, "deviceScanner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "connectionFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LT8/a$d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LT8/a$d$e;->a:LT8/c;

    iput-object p2, p0, LT8/a$d$e;->b:LT8/b$a;

    return-void
.end method


# virtual methods
.method public final a()LT8/b$a;
    .locals 1

    iget-object v0, p0, LT8/a$d$e;->b:LT8/b$a;

    return-object v0
.end method
