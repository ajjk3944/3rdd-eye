.class final LMj/r$l;
.super LMj/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMj/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "l"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LMj/h;

.field private final c:Z


# direct methods
.method constructor <init>(Ljava/lang/String;LMj/h;Z)V
    .locals 1

    invoke-direct {p0}, LMj/r;-><init>()V

    const-string v0, "name == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, LMj/r$l;->a:Ljava/lang/String;

    iput-object p2, p0, LMj/r$l;->b:LMj/h;

    iput-boolean p3, p0, LMj/r$l;->c:Z

    return-void
.end method


# virtual methods
.method a(LMj/u;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LMj/r$l;->b:LMj/h;

    invoke-interface {v0, p2}, LMj/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LMj/r$l;->a:Ljava/lang/String;

    iget-boolean v1, p0, LMj/r$l;->c:Z

    invoke-virtual {p1, v0, p2, v1}, LMj/u;->g(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
