.class public final synthetic LD8/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LD8/s;

.field public final synthetic b:Lje/r$b$a$a;


# direct methods
.method public synthetic constructor <init>(LD8/s;Lje/r$b$a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD8/o;->a:LD8/s;

    iput-object p2, p0, LD8/o;->b:Lje/r$b$a$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LD8/o;->a:LD8/s;

    iget-object v1, p0, LD8/o;->b:Lje/r$b$a$a;

    check-cast p1, LS8/c;

    invoke-static {v0, v1, p1}, LD8/s;->f(LD8/s;Lje/r$b$a$a;LS8/c;)LYg/s;

    move-result-object p1

    return-object p1
.end method
