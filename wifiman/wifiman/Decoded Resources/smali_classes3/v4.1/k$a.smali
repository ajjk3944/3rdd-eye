.class Lv4/k$a;
.super Lv4/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv4/k;->a(Lv4/k$b;Ljava/lang/Class;Ljava/lang/Class;)Lv4/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lv4/k$b;


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lv4/k$b;)V
    .locals 0

    iput-object p3, p0, Lv4/k$a;->c:Lv4/k$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lv4/k;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lv4/k$a;)V

    return-void
.end method
