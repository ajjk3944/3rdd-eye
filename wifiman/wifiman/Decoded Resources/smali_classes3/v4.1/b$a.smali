.class Lv4/b$a;
.super Lv4/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv4/b;->a(Lv4/b$b;LC4/a;Ljava/lang/Class;)Lv4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lv4/b$b;


# direct methods
.method constructor <init>(LC4/a;Ljava/lang/Class;Lv4/b$b;)V
    .locals 0

    iput-object p3, p0, Lv4/b$a;->c:Lv4/b$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lv4/b;-><init>(LC4/a;Ljava/lang/Class;Lv4/b$a;)V

    return-void
.end method


# virtual methods
.method public d(Lv4/q;Lo4/y;)Lo4/g;
    .locals 1

    iget-object v0, p0, Lv4/b$a;->c:Lv4/b$b;

    invoke-interface {v0, p1, p2}, Lv4/b$b;->a(Lv4/q;Lo4/y;)Lo4/g;

    move-result-object p1

    return-object p1
.end method
