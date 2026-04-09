.class final LI5/a$b;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final b:Lgg/i;

.field private final c:LI5/a$a;


# direct methods
.method constructor <init>(Lgg/i;LI5/a$a;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, LI5/a$b;->b:Lgg/i;

    iput-object p2, p0, LI5/a$b;->c:LI5/a$a;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    iget-object v0, p0, LI5/a$b;->b:Lgg/i;

    new-instance v1, LI5/a$e;

    iget-object v2, p0, LI5/a$b;->c:LI5/a$a;

    invoke-direct {v1, p1, v2}, LI5/a$e;-><init>(LDj/b;LI5/a$a;)V

    invoke-virtual {v0, v1}, Lgg/i;->b(LDj/b;)V

    return-void
.end method
