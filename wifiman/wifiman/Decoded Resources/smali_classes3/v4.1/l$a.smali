.class Lv4/l$a;
.super Lv4/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv4/l;->b(Lv4/l$b;Ljava/lang/Class;Ljava/lang/Class;)Lv4/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lv4/l$b;


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lv4/l$b;)V
    .locals 0

    iput-object p3, p0, Lv4/l$a;->c:Lv4/l$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lv4/l;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lv4/l$a;)V

    return-void
.end method


# virtual methods
.method public a(Lo4/g;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv4/l$a;->c:Lv4/l$b;

    invoke-interface {v0, p1}, Lv4/l$b;->a(Lo4/g;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
