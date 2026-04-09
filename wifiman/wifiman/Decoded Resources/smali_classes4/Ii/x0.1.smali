.class final LIi/x0;
.super LIi/C0;
.source "SourceFile"


# instance fields
.field private final e:Lmh/l;


# direct methods
.method public constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, LIi/C0;-><init>()V

    iput-object p1, p0, LIi/x0;->e:Lmh/l;

    return-void
.end method


# virtual methods
.method public u()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LIi/x0;->e:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
