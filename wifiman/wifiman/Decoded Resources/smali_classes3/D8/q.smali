.class public final synthetic LD8/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LD8/s;

.field public final synthetic b:Lje/r$b$a$a;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(LD8/s;Lje/r$b$a$a;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD8/q;->a:LD8/s;

    iput-object p2, p0, LD8/q;->b:Lje/r$b$a$a;

    iput-object p3, p0, LD8/q;->c:Ljava/util/Map;

    iput-object p4, p0, LD8/q;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LD8/q;->a:LD8/s;

    iget-object v1, p0, LD8/q;->b:Lje/r$b$a$a;

    iget-object v2, p0, LD8/q;->c:Ljava/util/Map;

    iget-object v3, p0, LD8/q;->d:Ljava/util/Map;

    check-cast p1, LS8/c;

    invoke-static {v0, v1, v2, v3, p1}, LD8/s;->h(LD8/s;Lje/r$b$a$a;Ljava/util/Map;Ljava/util/Map;LS8/c;)LYg/s;

    move-result-object p1

    return-object p1
.end method
