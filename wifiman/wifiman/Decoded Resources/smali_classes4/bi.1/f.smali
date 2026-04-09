.class Lbi/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field private final a:LBh/a;

.field private final b:LBh/a;


# direct methods
.method public constructor <init>(LBh/a;LBh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbi/f;->a:LBh/a;

    iput-object p2, p0, Lbi/f;->b:LBh/a;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lbi/f;->a:LBh/a;

    iget-object v1, p0, Lbi/f;->b:LBh/a;

    check-cast p1, LBh/m;

    check-cast p2, LBh/m;

    invoke-static {v0, v1, p1, p2}, Lbi/g;->d(LBh/a;LBh/a;LBh/m;LBh/m;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
