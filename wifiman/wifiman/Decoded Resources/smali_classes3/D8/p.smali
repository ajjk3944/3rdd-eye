.class public final synthetic LD8/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lje/r$b$a$a;

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:LD8/s;


# direct methods
.method public synthetic constructor <init>(Lje/r$b$a$a;Ljava/util/Map;LD8/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD8/p;->a:Lje/r$b$a$a;

    iput-object p2, p0, LD8/p;->b:Ljava/util/Map;

    iput-object p3, p0, LD8/p;->c:LD8/s;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LD8/p;->a:Lje/r$b$a$a;

    iget-object v1, p0, LD8/p;->b:Ljava/util/Map;

    iget-object v2, p0, LD8/p;->c:LD8/s;

    check-cast p1, LS8/c;

    invoke-static {v0, v1, v2, p1}, LD8/s;->i(Lje/r$b$a$a;Ljava/util/Map;LD8/s;LS8/c;)LYg/s;

    move-result-object p1

    return-object p1
.end method
