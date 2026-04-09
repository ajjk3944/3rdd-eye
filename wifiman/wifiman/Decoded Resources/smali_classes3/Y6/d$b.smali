.class LY6/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY6/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ljava/lang/reflect/Field;

.field final c:LY6/h;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Field;LY6/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY6/d$b;->a:Ljava/lang/String;

    iput-object p2, p0, LY6/d$b;->b:Ljava/lang/reflect/Field;

    iput-object p3, p0, LY6/d$b;->c:LY6/h;

    return-void
.end method


# virtual methods
.method a(LY6/k;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LY6/d$b;->c:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LY6/d$b;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method b(LY6/o;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LY6/d$b;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, LY6/d$b;->c:LY6/h;

    invoke-virtual {v0, p1, p2}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    return-void
.end method
