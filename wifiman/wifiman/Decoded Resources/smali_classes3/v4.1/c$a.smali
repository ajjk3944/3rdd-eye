.class Lv4/c$a;
.super Lv4/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv4/c;->a(Lv4/c$b;Ljava/lang/Class;Ljava/lang/Class;)Lv4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lv4/c$b;


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lv4/c$b;)V
    .locals 0

    iput-object p3, p0, Lv4/c$a;->c:Lv4/c$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lv4/c;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lv4/c$a;)V

    return-void
.end method
