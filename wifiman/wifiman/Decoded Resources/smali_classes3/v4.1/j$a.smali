.class Lv4/j$a;
.super Lv4/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv4/j;->a(Lv4/j$b;LC4/a;Ljava/lang/Class;)Lv4/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lv4/j$b;


# direct methods
.method constructor <init>(LC4/a;Ljava/lang/Class;Lv4/j$b;)V
    .locals 0

    iput-object p3, p0, Lv4/j$a;->c:Lv4/j$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lv4/j;-><init>(LC4/a;Ljava/lang/Class;Lv4/j$a;)V

    return-void
.end method
