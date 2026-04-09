.class final LIi/D0$b;
.super LIi/C0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIi/D0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final e:LIi/D0;

.field private final f:LIi/D0$c;

.field private final g:LIi/v;

.field private final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LIi/D0;LIi/D0$c;LIi/v;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, LIi/C0;-><init>()V

    iput-object p1, p0, LIi/D0$b;->e:LIi/D0;

    iput-object p2, p0, LIi/D0$b;->f:LIi/D0$c;

    iput-object p3, p0, LIi/D0$b;->g:LIi/v;

    iput-object p4, p0, LIi/D0$b;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public u()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 3

    iget-object p1, p0, LIi/D0$b;->e:LIi/D0;

    iget-object v0, p0, LIi/D0$b;->f:LIi/D0$c;

    iget-object v1, p0, LIi/D0$b;->g:LIi/v;

    iget-object v2, p0, LIi/D0$b;->h:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, LIi/D0;->n(LIi/D0;LIi/D0$c;LIi/v;Ljava/lang/Object;)V

    return-void
.end method
