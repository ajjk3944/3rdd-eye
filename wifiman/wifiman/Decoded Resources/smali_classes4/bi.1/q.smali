.class Lbi/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Lxi/l;


# direct methods
.method public constructor <init>(Lxi/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbi/q;->a:Lxi/l;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lbi/q;->a:Lxi/l;

    invoke-static {v0, p1}, Lbi/r;->a(Lxi/l;Ljava/lang/Object;)LYg/J;

    move-result-object p1

    return-object p1
.end method
