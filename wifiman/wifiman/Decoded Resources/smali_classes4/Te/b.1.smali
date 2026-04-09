.class public final synthetic LTe/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:LTe/f;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(ZLTe/f;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LTe/b;->a:Z

    iput-object p2, p0, LTe/b;->b:LTe/f;

    iput-wide p3, p0, LTe/b;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-boolean v0, p0, LTe/b;->a:Z

    iget-object v1, p0, LTe/b;->b:LTe/f;

    iget-wide v2, p0, LTe/b;->c:J

    check-cast p1, Lo0/f;

    invoke-static {v0, v1, v2, v3, p1}, LTe/e;->c(ZLTe/f;JLo0/f;)LYg/J;

    move-result-object p1

    return-object p1
.end method
