.class Lwh/T0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/U0;

.field private final b:I

.field private final c:LYg/m;


# direct methods
.method public constructor <init>(Lwh/U0;ILYg/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/T0;->a:Lwh/U0;

    iput p2, p0, Lwh/T0;->b:I

    iput-object p3, p0, Lwh/T0;->c:LYg/m;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lwh/T0;->a:Lwh/U0;

    iget v1, p0, Lwh/T0;->b:I

    iget-object v2, p0, Lwh/T0;->c:LYg/m;

    invoke-static {v0, v1, v2}, Lwh/U0;->f(Lwh/U0;ILYg/m;)Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method
