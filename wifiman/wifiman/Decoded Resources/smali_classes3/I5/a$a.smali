.class final LI5/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;
.implements LDj/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field volatile b:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI5/a$a;->a:Ljava/lang/Object;

    iput-object p1, p0, LI5/a$a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LI5/a$a;->a:Ljava/lang/Object;

    iput-object v0, p0, LI5/a$a;->b:Ljava/lang/Object;

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LI5/a$a;->b:Ljava/lang/Object;

    return-void
.end method

.method public j(LDj/c;)V
    .locals 0

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, LI5/a$a;->a:Ljava/lang/Object;

    iput-object p1, p0, LI5/a$a;->b:Ljava/lang/Object;

    return-void
.end method
