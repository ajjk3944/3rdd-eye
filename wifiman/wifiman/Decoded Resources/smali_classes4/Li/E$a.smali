.class final LLi/E$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIi/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLi/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final a:LLi/E;

.field public b:J

.field public final c:Ljava/lang/Object;

.field public final d:Ldh/e;


# direct methods
.method public constructor <init>(LLi/E;JLjava/lang/Object;Ldh/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLi/E$a;->a:LLi/E;

    iput-wide p2, p0, LLi/E$a;->b:J

    iput-object p4, p0, LLi/E$a;->c:Ljava/lang/Object;

    iput-object p5, p0, LLi/E$a;->d:Ldh/e;

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    iget-object v0, p0, LLi/E$a;->a:LLi/E;

    invoke-static {v0, p0}, LLi/E;->p(LLi/E;LLi/E$a;)V

    return-void
.end method
