.class public abstract LN4/F$e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/F$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()LN4/F$e;
.end method

.method public abstract b(LN4/F$e$a;)LN4/F$e$b;
.end method

.method public abstract c(Ljava/lang/String;)LN4/F$e$b;
.end method

.method public abstract d(Z)LN4/F$e$b;
.end method

.method public abstract e(LN4/F$e$c;)LN4/F$e$b;
.end method

.method public abstract f(Ljava/lang/Long;)LN4/F$e$b;
.end method

.method public abstract g(Ljava/util/List;)LN4/F$e$b;
.end method

.method public abstract h(Ljava/lang/String;)LN4/F$e$b;
.end method

.method public abstract i(I)LN4/F$e$b;
.end method

.method public abstract j(Ljava/lang/String;)LN4/F$e$b;
.end method

.method public k([B)LN4/F$e$b;
    .locals 2

    new-instance v0, Ljava/lang/String;

    invoke-static {}, LN4/F;->a()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {p0, v0}, LN4/F$e$b;->j(Ljava/lang/String;)LN4/F$e$b;

    move-result-object p1

    return-object p1
.end method

.method public abstract l(LN4/F$e$e;)LN4/F$e$b;
.end method

.method public abstract m(J)LN4/F$e$b;
.end method

.method public abstract n(LN4/F$e$f;)LN4/F$e$b;
.end method
