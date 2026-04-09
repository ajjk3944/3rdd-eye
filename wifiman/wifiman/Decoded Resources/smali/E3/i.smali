.class final LE3/i;
.super LE3/g;
.source "SourceFile"


# instance fields
.field private final c:LE3/k;


# direct methods
.method constructor <init>(LE3/k;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, LE3/g;-><init>(II)V

    iput-object p1, p0, LE3/i;->c:LE3/k;

    return-void
.end method


# virtual methods
.method protected final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LE3/i;->c:LE3/k;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
