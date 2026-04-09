.class public final LGh/w;
.super LGh/y;
.source "SourceFile"

# interfaces
.implements LQh/n;


# instance fields
.field private final a:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LGh/y;-><init>()V

    iput-object p1, p0, LGh/w;->a:Ljava/lang/reflect/Field;

    return-void
.end method


# virtual methods
.method public G()Z
    .locals 1

    invoke-virtual {p0}, LGh/w;->U()Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    move-result v0

    return v0
.end method

.method public O()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic S()Ljava/lang/reflect/Member;
    .locals 1

    invoke-virtual {p0}, LGh/w;->U()Ljava/lang/reflect/Field;

    move-result-object v0

    return-object v0
.end method

.method public U()Ljava/lang/reflect/Field;
    .locals 1

    iget-object v0, p0, LGh/w;->a:Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public V()LGh/E;
    .locals 3

    sget-object v0, LGh/E;->a:LGh/E$a;

    invoke-virtual {p0}, LGh/w;->U()Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v1

    const-string v2, "getGenericType(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LGh/E$a;->a(Ljava/lang/reflect/Type;)LGh/E;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getType()LQh/x;
    .locals 1

    invoke-virtual {p0}, LGh/w;->V()LGh/E;

    move-result-object v0

    return-object v0
.end method
