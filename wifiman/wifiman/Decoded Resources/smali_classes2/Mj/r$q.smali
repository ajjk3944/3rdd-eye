.class final LMj/r$q;
.super LMj/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMj/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "q"
.end annotation


# instance fields
.field final a:Ljava/lang/Class;


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, LMj/r;-><init>()V

    iput-object p1, p0, LMj/r$q;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method a(LMj/u;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LMj/r$q;->a:Ljava/lang/Class;

    invoke-virtual {p1, v0, p2}, LMj/u;->h(Ljava/lang/Class;Ljava/lang/Object;)V

    return-void
.end method
