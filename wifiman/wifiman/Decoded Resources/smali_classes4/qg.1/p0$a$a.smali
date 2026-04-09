.class final Lqg/p0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/p0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:LDj/c;

.field final b:J


# direct methods
.method constructor <init>(LDj/c;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg/p0$a$a;->a:LDj/c;

    iput-wide p2, p0, Lqg/p0$a$a;->b:J

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lqg/p0$a$a;->a:LDj/c;

    iget-wide v1, p0, Lqg/p0$a$a;->b:J

    invoke-interface {v0, v1, v2}, LDj/c;->request(J)V

    return-void
.end method
