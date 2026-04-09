.class LI2/m$a;
.super LW2/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI2/m;-><init>(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:LI2/m;


# direct methods
.method constructor <init>(LI2/m;J)V
    .locals 0

    iput-object p1, p0, LI2/m$a;->e:LI2/m;

    invoke-direct {p0, p2, p3}, LW2/h;-><init>(J)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LI2/m$b;

    invoke-virtual {p0, p1, p2}, LI2/m$a;->n(LI2/m$b;Ljava/lang/Object;)V

    return-void
.end method

.method protected n(LI2/m$b;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p1}, LI2/m$b;->c()V

    return-void
.end method
