.class Lwh/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lpi/S;

.field private final b:Lwh/X$a;

.field private final c:Lwh/X;


# direct methods
.method public constructor <init>(Lpi/S;Lwh/X$a;Lwh/X;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/L;->a:Lpi/S;

    iput-object p2, p0, Lwh/L;->b:Lwh/X$a;

    iput-object p3, p0, Lwh/L;->c:Lwh/X;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lwh/L;->a:Lpi/S;

    iget-object v1, p0, Lwh/L;->b:Lwh/X$a;

    iget-object v2, p0, Lwh/L;->c:Lwh/X;

    invoke-static {v0, v1, v2}, Lwh/X$a;->n(Lpi/S;Lwh/X$a;Lwh/X;)Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method
