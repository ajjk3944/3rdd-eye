.class public final LGh/r;
.super LGh/h;
.source "SourceFile"

# interfaces
.implements LQh/h;


# instance fields
.field private final c:Ljava/lang/Class;


# direct methods
.method public constructor <init>(LZh/f;Ljava/lang/Class;)V
    .locals 1

    const-string v0, "klass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LGh/h;-><init>(LZh/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, LGh/r;->c:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public c()LQh/x;
    .locals 2

    sget-object v0, LGh/E;->a:LGh/E$a;

    iget-object v1, p0, LGh/r;->c:Ljava/lang/Class;

    invoke-virtual {v0, v1}, LGh/E$a;->a(Ljava/lang/reflect/Type;)LGh/E;

    move-result-object v0

    return-object v0
.end method
